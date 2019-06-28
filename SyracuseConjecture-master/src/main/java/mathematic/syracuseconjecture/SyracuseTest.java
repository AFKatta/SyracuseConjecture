package mathematic.syracuseconjecture;

import mathematic.syracuseconjecture.algorithms.Syracuse;
import mathematic.syracuseconjecture.algorithms.SyracuseArrayCache;
import mathematic.syracuseconjecture.algorithms.SyracuseDictionaryCache;

public class SyracuseTest {

    public static void main(String[] args) {
        Syracuse noCache = new Syracuse();
        noCache.main(null);

        SyracuseArrayCache arrayCache = new SyracuseArrayCache();
        arrayCache.main(null);

        SyracuseDictionaryCache mapCache = new SyracuseDictionaryCache();
        mapCache.main(null);
    }
}
