# Alfresco ActiveMQ

This project provides different alternatives to use [ActiveMQ](https://activemq.apache.org) with ACS 7.4

Docker Compose templates for easy deployment and testing are provided in the following folders:

* Alfresco Community

  * [docker-community](docker-community) - Sample Community deployment without using ActiveMQ

* Alfresco Enterprise

  * [docker-aio](docker-aio) - Sample Enterprise deployment using ActiveMQ with AIO (All-In-One) services for Transform Service and Search Enterprise
  * [docker-split](docker-split) - Sample Enterprise deployment using ActiveMQ with individual services for Transform Service and Search Enterprise
  * [docker-aio-monitoring](docker-aio-monitoring) - Sample Enterprise deployment using ActiveMQ with AIO (All-In-One) services for Transform Service and Search Enterprise with monitoring tools integrated ([Jolokia](https://jolokia.org), [Prometheus](https://prometheus.io) and [Grafana](https://grafana.com))

When using *Alfresco Enterprise*, customer credentials for [quay.io/alfresco](https://quay.io/organization/alfresco) Docker Images are required.

>> This project has been designed to test the integrations easily, deploying them in *prod* environments would require additional operations and resources.


## Using Volumes for local storage

All Docker Compose templates provided in this project are not providing local storage using Docker Volumes. Enabling this feature can be done using a configuration like the following one.

```
activemq:
    image: alfresco/alfresco-activemq:5.17.1-jre11-rockylinux8
    mem_limit: 1g
    ports:
        - 8161:8161
    volumes:
        - ./data/activemq-data:/opt/activemq/data
```

>> ActiveMQ 'data' folder includes both data and log information.