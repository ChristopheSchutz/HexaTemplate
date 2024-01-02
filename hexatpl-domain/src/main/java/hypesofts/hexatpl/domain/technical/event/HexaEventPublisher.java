package hypesofts.hexatpl.domain.technical.event;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class HexaEventPublisher implements ApplicationEventPublisher {

    private final ApplicationContext context;

    @Override
    public void publishEvent(Object event) {
        context.publishEvent(event);
    }
}
