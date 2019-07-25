package com.twu.biblioteca.TestDouble;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class PrintStreamSpy extends PrintStream {
    private ArrayList<String> content = new ArrayList<>();

    public PrintStreamSpy(OutputStream out) {
        super(out);
    }

    @Override
    public void println(String x) {
        content.add(x);
    }

    public String getContent() {
        return String.join("\n", content);
    }
}
