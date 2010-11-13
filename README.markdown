## Usage

         $ export APPENGINE_SDK_HOME="$DEV_HOME/appengine-java-sdk-1.3.8"
         $ git clone git://github.com/mtkopone/sbt-scalatra-appengine-template.git
         $ cd sbt-scalatra-appengine-template
         $ sbt
         sbt> update
         sbt> dev-appserver-start
         $ open http://localhost:8080/

## Once deploying to the app engine

Change src/main/webapp/WEB-INF/appengine-web.xml:application to match you app-id

         
## IntelliJ Idea integration:

         $ sbt idea
         > "Open existing project" in Idea