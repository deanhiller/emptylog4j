package org.apache.log4j;

import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;

public class FileAppender implements Appender {

	public FileAppender(PatternLayout layour, String path, boolean append) {
		
	}

	@Override
	public void addFilter(Filter arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearFilters() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doAppend(LoggingEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ErrorHandler getErrorHandler() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Filter getFilter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public org.apache.log4j.spi.Layout getLayout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean requiresLayout() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setErrorHandler(ErrorHandler arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLayout(org.apache.log4j.spi.Layout arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setName(String arg0) {
		// TODO Auto-generated method stub
		
	}
}
