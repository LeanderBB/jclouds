/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jclouds.openstack.nova.v2_0.functions.internal;

import com.google.common.base.Function;
import javax.inject.Singleton;

import org.jclouds.http.HttpResponse;
import org.jclouds.http.functions.ParseJson;
import org.jclouds.json.internal.GsonWrapper;

/**
 *
 * @author lbb
 */
@Singleton
public class DiagnosticsOrNull implements Function<HttpResponse, String> {

    @Override
    public String apply(HttpResponse f) {
        System.out.println("DiagnosticsOrNull:" +f);
        if (f.getStatusCode() != 500) {
            return f.getMessage();
        } else {
            return null;
        }
    }
}
