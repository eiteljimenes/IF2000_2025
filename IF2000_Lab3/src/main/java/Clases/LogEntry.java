package Clases;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * LogEntry: manages a record of banking operations.
 * Each entry has a unique ID, type of event, timestamp, and details.
 */
public class LogEntry {

    // Enum to indicate type of event
    public enum EventType {
        DEPOSIT, WITHDRAW, TRANSFER
    }

    // List to store all log entries
    private final List<Entry> entries = new ArrayList<>();

    /**
     * Entry: single record inside the log
     */
    public static class Entry {
        private static int counter = 0;
        private final int idEvent;       // Unique ID for this entry
        private final EventType eventType;
        private final LocalDateTime timestamp;
        private final String details;

        public Entry(EventType eventType, String details) {
            this.idEvent = ++counter;
            this.eventType = eventType;
            this.timestamp = LocalDateTime.now();
            this.details = details;
        }

        @Override
        public String toString() {
            return "LogEntry[id=" + idEvent +
                    ", event=" + eventType +
                    ", time=" + timestamp +
                    ", details=" + details + "]";
        }
    }

    /**
     * Record a new event in the log
     */
    public void record(EventType eventType, String details) {
        entries.add(new Entry(eventType, details));
    }

    /**
     * Return all entries (read-only)
     */
    public List<Entry> getEntries() {
        return Collections.unmodifiableList(entries);
    }

    /**
     * Print all entries to console
     */
    public void printAll() {
        System.out.println("=== LOG ENTRIES ===");
        for (Entry e : entries) {
            System.out.println(e);
        }
    }
}
