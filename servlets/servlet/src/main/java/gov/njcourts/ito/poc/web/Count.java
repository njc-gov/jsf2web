package gov.njcourts.ito.poc.web;

import gov.njcourts.ito.poc.ejb.CounterBean;
import java.io.Serializable;

import javax.enterprise.context.ConversationScoped;
import javax.inject.Named;
import javax.ejb.EJB;

@Named
@ConversationScoped
public class Count implements Serializable {
    @EJB
    private CounterBean counterBean;

    private int hitCount;

    public Count() {
        this.hitCount = 0;
    }

    public int getHitCount() {
        hitCount = counterBean.getHits();
        return hitCount;
    }

    public void setHitCount(int newHits) {
        this.hitCount = newHits;
    }
}