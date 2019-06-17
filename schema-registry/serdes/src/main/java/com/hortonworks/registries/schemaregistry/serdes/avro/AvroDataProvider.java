package com.hortonworks.registries.schemaregistry.serdes.avro;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.specific.SpecificDatumReader;

/**
 * Provides instances of {@link GenericData} or {@link SpecificData}
 * to be used in various stages of ser/des. Implementations may provide
 * specific configuration or behavior by subclassing these types.
 * THe default will simply call {@link GenericData#get()} and
 * {@link SpecificData#get()}.
 */
public interface AvroDataProvider {

    default GenericData getGenericData() {
        return GenericData.get();
    }

    default SpecificData getSpecificData() {
        return SpecificData.get();
    }

    default <T> SpecificDatumReader<T> getSpecificDatumReader(Schema writer, Schema reader) {
        return new SpecificDatumReader<>(writer, reader == null ? writer : reader, getSpecificData());
    }

    default <T> GenericDatumReader<T> getGenericDatumReader(Schema writer, Schema reader) {
        return new GenericDatumReader<>(writer, reader == null ? writer : reader, getSpecificData());
    }

}
