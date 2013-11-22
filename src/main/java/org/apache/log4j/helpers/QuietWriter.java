package org.apache.log4j.helpers;

import java.io.FilterWriter;
import java.io.Writer;

public class QuietWriter extends FilterWriter {

	protected QuietWriter(Writer arg0) {
		super(arg0);
	}

}
