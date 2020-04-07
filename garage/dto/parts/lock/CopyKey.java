package garage.dto.parts.lock;

import garage.dto.parts.lock.api.IKey;

public class CopyKey implements IKey {

    private String openKey = null;

    public CopyKey() {
    }

    @Override
    public String getOpenKey() {
        return openKey;
    }

    public void setOpenKey(String openKey) {
        this.openKey = openKey;
    }
}
