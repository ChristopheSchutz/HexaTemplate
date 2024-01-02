package hypesofts.hexatpl.domain.technical.baseclass;

import hypesofts.hexatpl.domain.technical.entityfetcher.EntityFetcherChain;
import lombok.Getter;

import java.util.UUID;

@Getter
public abstract class FetchableDomainId<T extends hypesofts.hexatpl.domain.technical.baseclass.DomainEntity> implements hypesofts.hexatpl.domain.technical.baseclass.DomainId {
    private final UUID id;

    protected FetchableDomainId(UUID id) {
        this.id = id;
    }

    public T fetchEntity() {
        return (T) EntityFetcherChain.fetchEntity(this);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof FetchableDomainId && this.id.equals(((FetchableDomainId) o).getId());
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}