/**
 * 
 */
package com.ideamoment.saml.model;

import org.junit.Test;


/**
 * @author Chinakite
 *
 */
public class TestSamlConfig {
    @Test
    public void testGetRootKey() {
        SamlConfig.init();
        System.out.println(SamlConfig.getCertstr());
        System.out.println(SamlConfig.getRootPrivateKey());
        System.out.println(SamlConfig.getRootPublicKey());
    }
}
