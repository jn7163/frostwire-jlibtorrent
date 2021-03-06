package com.frostwire.jlibtorrent.plugins;

import com.frostwire.jlibtorrent.*;
import com.frostwire.jlibtorrent.alerts.Alert;
import com.frostwire.jlibtorrent.swig.bdecode_node;

import java.util.List;

/**
 * @author gubatron
 * @author aldenml
 */
public abstract class AbstractPlugin implements Plugin {

    @Override
    public boolean handleOperation(Operation op) {
        return false;
    }

    @Override
    public TorrentPlugin newTorrent(TorrentHandle t) {
        return null;
    }

    @Override
    public void added(SessionHandle s) {
    }

    @Override
    public void registerDhtPlugins(List<Pair<String, DhtPlugin>> plugins) {
    }

    @Override
    public void onAlert(Alert a) {
    }

    @Override
    public boolean onUnknownTorrent(Sha1Hash infoHash, PeerConnectionHandle pc, AddTorrentParams p) {
        return false;
    }

    @Override
    public void onTick() {
    }

    @Override
    public void saveState(Entry e) {
    }

    @Override
    public void loadState(bdecode_node n) {
    }
}
