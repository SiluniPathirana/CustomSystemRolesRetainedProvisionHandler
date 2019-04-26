package org.wso2.custom;

import org.wso2.carbon.user.core.UserRealm;
import org.wso2.carbon.user.core.UserStoreException;
import org.wso2.carbon.identity.application.authentication.framework.handler.provisioning.impl.*;

import java.util.ArrayList;
import java.util.List;


public class CustomSystemRolesRetainedProvisionHandler extends SystemRolesRetainedProvisionHandler {


    @Override
    protected List<String> retrieveRolesToBeDeleted(UserRealm realm, List<String> currentRolesList,
                                                    List<String> rolesToAdd) throws UserStoreException {
        return new ArrayList<>();
    }

}
