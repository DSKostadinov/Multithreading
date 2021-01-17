package main.java.com.metrics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxMetricsList {

    List<Long> objList;

    public MinMaxMetricsList() {
        objList = Collections.synchronizedList(new ArrayList<Long>());
    }

    public void addSample(long newSample) {
        objList.add(newSample);
    }

    public long getMin() {
        return Collections.min(this.objList);
    }

    public long getMax() {
        return Collections.max(this.objList);
    }
}
