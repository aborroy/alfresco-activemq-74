# Alfresco Community with ActiveMQ disabled

By default, when using Alfresco Community, Repository service is producing messages for document creation and update to ActiveMQ. However the only component that is able to consume these messages is the [Alfresco Out Of Process SDK](https://github.com/Alfresco/alfresco-java-sdk). Additionally, Alfresco Community doesn't include permissions data in this asynchronous messages (while Alfresco Enterprise does). 

The most common scenario for Alfresco Community 7.4 deployments is to disable asynchronous messages production and **not** to desploy ActiveMQ service.

Add following properties to Alfresco Repository service to disable async messages production.

```
messaging.subsystem.autoStart=false
repo.event2.enabled=false
```

## Docker Compose Template

The file [compose.yaml](compose.yaml) includes a sample deployment without async messages production and without ActiveMQ service.

Run the composition using default command.

```
docker compose up
```

**Service URLs**

ACA - http://localhost:8080/content-app/

Share - http://localhost:8080/share

Repository - http://localhost:8080/alfresco/

Transform - http://localhost:8090/

Search - http://localhost:8083/solr/

**Credentials**

admin/admin