package hypesofts.hexatpl.domain.technical.entityfetcher;

import hypesofts.hexatpl.domain.technical.baseclass.DomainEntity;
import hypesofts.hexatpl.domain.technical.baseclass.DomainId;
import hypesofts.hexatpl.domain.technical.exception.HexaError;
import hypesofts.hexatpl.domain.technical.exception.HexaException;
import org.springframework.beans.factory.annotation.Configurable;

import java.util.List;

@Configurable
public class EntityFetcherChain {

    public List<EntityFetcher> entityFetchers;

    private static EntityFetcherChain INSTANCE;

    private EntityFetcherChain() {
        entityFetchers = SpringContext.getBeans(EntityFetcher.class);
    }

    private static EntityFetcherChain getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new EntityFetcherChain();
        }
        return INSTANCE;
    }

    public static DomainEntity fetchEntity(DomainId domainId) {
        for (EntityFetcher fetcher : getInstance().entityFetchers) {
            if (fetcher.canFetch(domainId)) {
                return fetcher.fetchEntity(domainId);
            }
        }
        throw new HexaException(HexaError.ENTITY_FETCHER_NOT_FOUND);
    }
}
