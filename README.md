# FTS Specific
This is a FTS fork of the hortonworks schema registry based on branch 0.3.0 to patch issues that have been found in the public version. To address version conflict issues this FTS specific version is versioned using a "-fts" suffix such as "0.3.0-fts" which is intended to match with the public version 0.3.0 with FTS modifications. 

To build this fork and publish to our local nexus repos the project has been updated to point to our local nexus and to remove public repos that pose problems, so building and publishing should not be any different then any of our other projects.

From the root directory all you need to do is run:

```
mvn deploy -Drepoid=fan360-nexus -Dreponame=Fan360Nexus -Drepourl=https://nexus.fanthreesixty.com/repository/maven-releases/
``` 

As long as you have publish rights then this should build all of the submodules and publish, however it will take about 30-40 minutes.

To change the version of the project you need to modify the version information in every sub-module pom. To see an example see commit 14ced2805d145b2a4740a7c6e02c53762752142b for all of the sub-modules and then you also need to update the root parent pom which is done in commit 7d1181200df11342956f32030c5aa31cc945963a.

# Registry

[![Join the chat at https://gitter.im/registry-users/Lobby](https://badges.gitter.im/registry-users/Lobby.svg)](https://gitter.im/registry-users/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

Registry is a framework to build metadata repositories. As part of Registry, we currently have SchemaRegistry and MLRegistry repositories.

Follow [@schemaregistry](https://twitter.com/schemaregistry) on Twitter for updates on the project.

## Documentation
Documentation and tutorials can be found on the [Registry docs](http://registry-project.readthedocs.io/en/latest/)


## Getting Help

Registry users or devs should send a message to [Registry Google Group](https://groups.google.com/forum/#!forum/registry)

## License

Copyright 2016 Hortonworks.
 
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
  
http://www.apache.org/licenses/LICENSE-2.0
 
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
