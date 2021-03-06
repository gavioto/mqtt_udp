package ru.dz.mqtt.viewer;

public class TopicItem {

	private String topic;
	private String value;
	private String from = "?";

	public TopicItem(String topic) {
		this.topic = topic;
		this.value = "";
	}
	
	public TopicItem(String topic, String value) {
		this.topic = topic;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return topic+"="+value;
	}

	public String getTopic() {		return topic;	}
	public String getValue() {		return value;	}

	public void setFrom(String from) { this.from = from; }
	public String getFrom() {		return from;	}
}
