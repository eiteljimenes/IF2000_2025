
package Clases;

/**
 *
 * @author eitel
 */
   
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * EventType: types of events we log.
 */
public class LogEntry {
 
enum EventType {
    DEPOSIT, WITHDRAW, TRANSFER
}

/**
 * LogEntry: single immutable record in the Bitacora.
 */
class LogEntry {
    private static int counter = 0;
    private final int idEvent;
    private final EventType eventType;
    private final LocalDateTime timestamp;
    private final String details;

    public LogEntry(EventType eventType, String details) {
        this.idEvent = ++counter;
        this.eventType = eventType;
        this.timestamp = LocalDateTime.now();
        this.details = details;
    }

    public int getIdEvent() { return idEvent; }
    public EventType getEventType() { return eventType; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public String getDetails() { return details; }

    @Override
    public String toString() {
        return String.format("LogEntry[id=%d, event=%s, time=%s, details=%s]",
                idEvent, eventType, timestamp, details);
    }
}

/**
 * Bitacora: collects log entries and allows printing / retrieval.
 */
class Bitacora {
    private final List<LogEntry> entries = new ArrayList<>();

    public void record(EventType eventType, String details) {
        entries.add(new LogEntry(eventType, details));
    }

    public List<LogEntry> getEntries() {
        return Collections.unmodifiableList(entries);
    }

    public void printAll() {
        System.out.println("=== BITACORA ===");
        for (LogEntry e : entries) {
            System.out.println(e);
        }
    }
}
}
  
    

