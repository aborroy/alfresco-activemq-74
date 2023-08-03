FROM quay.io/alfresco/alfresco-elasticsearch-reindexing:3.3.0

COPY wait.sh /
RUN chmod +x /wait.sh

ENTRYPOINT /wait.sh && exec java $JAVA_OPTS -jar app.jar
