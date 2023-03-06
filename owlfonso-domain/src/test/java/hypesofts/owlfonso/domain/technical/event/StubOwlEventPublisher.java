package hypesofts.owlfonso.domain.technical.event;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class StubOwlEventPublisher implements ApplicationEventPublisher {

    @Getter
    List<Object> events = new ArrayList<>();

    @Override
    public void publishEvent(Object event) {
        this.events.add(event);
        log.debug("Event would be pushed to ApplicationContext: {}", event);
    }

    public void clear() {
        this.events.clear();
    }
}
