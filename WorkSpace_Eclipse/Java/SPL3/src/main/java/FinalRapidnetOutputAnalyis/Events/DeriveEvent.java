package FinalRapidnetOutputAnalyis.Events;

import FinalRapidnetOutputAnalyis.Tuples.Tuple;

public class DeriveEvent  extends  Event{
    public String rule;

    public DeriveEvent() {
        this.eventName="Derive";
    }

    public DeriveEvent(String time, String node, Tuple t, String rule) {
        super();
        this.eventName = "Derive";
        this.node = node;
        this.time = time;
        this.tuple = t;
        this.rule=rule;

    }
    public String toString() {
        return this.eventName+" : ("+this.node+", ["+this.time+"], "
                +this.tuple.toString()+")";
    }
}
