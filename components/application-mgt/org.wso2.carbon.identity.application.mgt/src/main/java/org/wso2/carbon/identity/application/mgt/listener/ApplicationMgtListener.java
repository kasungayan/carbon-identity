/*
 *  Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.wso2.carbon.identity.application.mgt.listener;

import org.wso2.carbon.identity.application.common.IdentityApplicationManagementException;
import org.wso2.carbon.identity.application.common.model.ServiceProvider;

public interface ApplicationMgtListener {

    /**
     * Get the execution order identifier for this listener.
     *
     * @return The execution order identifier integer value.
     */
    int getExecutionOrderId();

    /**
     * Get the default order identifier for this listener.
     *
     * @return default order id
     */
    public int getDefaultOrderId();

    /**
     * Check whether the listener is enabled or not
     *
     * @return true if enabled
     */
    public boolean isEnable();

    /**
     * Define any additional actions before creating an application
     *
     * @param serviceProvider Created Service Provider
     * @param tenantDomain    Tenant domain of the user
     * @param userName        User name of the user
     * @return Whether execution of this method of the underlying UserStoreManager must happen.
     * @throws IdentityApplicationManagementException
     */
    public boolean doPreCreateApplication(ServiceProvider serviceProvider, String tenantDomain, String userName) throws IdentityApplicationManagementException;

    /**
     * Define any additional actions after creating an application
     *
     * @param serviceProvider
     * @param tenantDomain
     * @param userName
     * @return
     * @throws IdentityApplicationManagementException
     */
    public boolean doPostCreateApplication(ServiceProvider serviceProvider, String tenantDomain, String userName) throws IdentityApplicationManagementException;

    /**
     * Define any additional actions before updating an application
     *
     * @param serviceProvider
     * @param tenantDomain
     * @param userName
     * @return
     * @throws IdentityApplicationManagementException
     */
    public boolean doPreUpdateApplication(ServiceProvider serviceProvider, String tenantDomain, String userName) throws IdentityApplicationManagementException;

    /**
     * Define any additional actions after updating an application
     *
     * @param serviceProvider
     * @param tenantDomain
     * @param userName
     * @return
     * @throws IdentityApplicationManagementException
     */
    public boolean doPostUpdateApplication(ServiceProvider serviceProvider, String tenantDomain, String userName) throws IdentityApplicationManagementException;

    /**
     * Define any additional actions before deleting an application
     *
     * @param applicationName
     * @param tenantDomain
     * @param userName
     * @return
     * @throws IdentityApplicationManagementException
     */
    public boolean doPreDeleteApplication(String applicationName, String tenantDomain, String userName) throws IdentityApplicationManagementException;

    /**
     * Define any additional actions after deleting an application
     *
     * @param applicationName
     * @param tenantDomain
     * @param userName
     * @return
     * @throws IdentityApplicationManagementException
     */
    public boolean doPostDeleteApplication(String applicationName, String tenantDomain, String userName) throws IdentityApplicationManagementException;

}
