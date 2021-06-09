package com.test.kafka.constants;

public interface IKafkaConstants {
	public static String KAFKA_BROKERS = "localhost:9092";
	
	public static Integer MESSAGE_COUNT=5;
	
	public static String CLIENT_ID="client1";
	
	public static String TOPIC_NAME="spm-ingestion-notif";
	
	public static String GROUP_ID_CONFIG="spm-ingestion-notif-group";
	
	public static Integer MAX_NO_MESSAGE_FOUND_COUNT=1;
	
	public static String OFFSET_RESET_LATEST="latest";
	
	public static String OFFSET_RESET_EARLIER="earliest";
	
	public static Integer MAX_POLL_RECORDS=1;
}
