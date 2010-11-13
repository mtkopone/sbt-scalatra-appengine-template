## Usage

         $ export APPENGINE_SDK_HOME="$DEV_HOME/appengine-java-sdk-1.3.8"
         $ git clone git://github.com/mtkopone/sbt-scalatra-appengine-template.git
         $ cd sbt-scalatra-appengine-template
         $ sbt
         sbt> update
         sbt> dev-appserver-start
         $ open http://localhost:8080/
         
## IntelliJ Idea integration:

         $ sbt idea
         > "Open existing project" in Idea
         
To run jetty in Idea, just open EmbeddedJetty and Run/Debug.
