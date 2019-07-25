package com.twu.biblioteca.TestDouble;

import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamSpy extends PrintStream {
    private String content;

    public PrintStreamSpy(OutputStream out) {
        super(out);
    }

    @Override
    public void println(String x) {
        content = x;
    }

    public String getContent() {
        return content;
    }
}
