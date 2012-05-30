package org.osmsurround.api;

import java.util.Set;

import org.osm.schema.OsmUser;

public interface UserOperations {

	OsmUser getForUser();

	Set<OsmPermission> getPermissions();

}
