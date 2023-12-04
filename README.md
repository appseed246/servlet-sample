# servlet-sample

## 環境

```
Server version: Apache Tomcat/10.1.16
Server built:   Nov 10 2023 16:17:33 UTC
Server number:  10.1.16.0
OS Name:        Mac OS X
OS Version:     13.6
Architecture:   aarch64
JVM Version:    17.0.8+7-LTS
JVM Vendor:     Amazon.com Inc.
```

## デプロイ

1. `./gradlew clean war` を実行し、warファイルを作成する
2. `${project_root}/build/libs` に生成された `servlet-sample.war` を `$CATALINA_HOME/webapps` に配置する
3. `$CATALINA_HOME/bin/catalina.sh run` を実行する
4. http://localhost:8080/servlet-sample/hello を開く