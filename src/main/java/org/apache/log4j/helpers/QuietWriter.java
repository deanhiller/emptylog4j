package org.apache.log4j.helpers;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

public class QuietWriter extends FilterWriter {

	protected QuietWriter(Writer arg0) {
		super(arg0);
	}

	@Override
	public void flush() {
		try {
			super.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void write(String str) {
		try {
			super.write(str);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
