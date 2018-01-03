# springboot-apache-kafka
A simple example to display the producer-consumer consumption of a String message in Apache Kafka using springboot

1. Start ZooKeeper server - zookeeper-server-start.bat ..\..\config\zookeeper.properties

2. Start the Apache Kafka Server - kafka-server-start.bat ..\..\config\server.properties

3. Start the Consumer service - kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic kafkaTemplate_topic --from-beginning

4. Start the springboot project and hit the url - http://localhost:8080/kafka?input=kafka

You will notice that the message will be recieved in the Consumer in the command prompt


