package hypesofts.owlfonso.domain.technical.entityfetcher;

import hypesofts.owlfonso.domain.technical.baseclass.DomainEntity;
import hypesofts.owlfonso.domain.technical.baseclass.DomainId;
import hypesofts.owlfonso.domain.technical.exception.OwlError;
import hypesofts.owlfonso.domain.technical.exception.OwlException;
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
        throw new OwlException(OwlError.ENTITY_FETCHER_NOT_FOUND);
    }
}
