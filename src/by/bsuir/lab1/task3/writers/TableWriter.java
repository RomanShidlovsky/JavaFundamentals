package by.bsuir.lab1.task3.writers;

public class TableWriter {
    public static class TableWriterOptions {
        public int rows;
        public int columns;
        public int columnWidth;
        public String[] title;

        public TableWriterOptions(int rows, int columns, int columnWidth) {
            this.rows = rows;
            this.columns = columns;
            this.columnWidth = columnWidth;
            this.title = null;
        }
        public TableWriterOptions(int rows, int columns, int columnWidth, String[] title) {
            this.rows = rows;
            this.columns = columns;
            this.columnWidth = columnWidth;
            this.title = title;
        }
    }

    public TableWriterOptions options;

    public TableWriter(TableWriterOptions options) {
        this.options = options;
    }

    public <T> void printRow(T[] values) {
        printRow(values, true, true);
    }

    public <T> void printRow(T[] values, boolean topBorder, boolean bottomBorder) {
        int tableWidth = this.options.columnWidth * this.options.columns;

        if (topBorder) {
            for (int i = 0; i < tableWidth + 1; i++) {
                System.out.print('-');
            }
        }
        System.out.println();
        System.out.print('|');
        for (int i = 0; i < this.options.columns; i++) {
            int width = options.columnWidth - 1;
            if (values != null && i < values.length) {
                String str;
                String format;
                if (values[i] instanceof Float || values[i] instanceof Double) {
                    format = "%" + width + ".2f";

                } else {
                    format = "%" + width + "s";
                }
                str = String.format(format, values[i]);
                System.out.print(str);
            } else {
                for (int j = 0; j < width; j++) {
                    System.out.print(" ");
                }
            }
            System.out.print("|");
        }
        System.out.println();
        if (bottomBorder) {
            for (int i = 0; i < tableWidth + 1; i++) {
                System.out.print('-');
            }
        }
    }

    public <T> void printTable(T[][] pairs) {
        if (this.options.title != null) {
            printRow(this.options.title, true, false);
        }
        boolean bottomBorder = false;
        for (int i = 0; i < options.rows; i++) {
            if (i+1 == options.rows) {
                bottomBorder = true;
            }
            if (i < pairs.length) {
                printRow(pairs[i],true, bottomBorder);
            } else {
                printRow(null, true, bottomBorder);
            }
        }
    }
}
