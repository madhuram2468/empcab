package com.empcab.util;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class CustomLocalDateTimeSerializer extends JsonSerializer<LocalDateTime> {

	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");

	public CustomLocalDateTimeSerializer() {
		super();
	}

	@Override
	public void serialize(LocalDateTime value, JsonGenerator gen, SerializerProvider arg2)
			throws IOException {
		gen.writeString(formatter.format(value));
	}
}
