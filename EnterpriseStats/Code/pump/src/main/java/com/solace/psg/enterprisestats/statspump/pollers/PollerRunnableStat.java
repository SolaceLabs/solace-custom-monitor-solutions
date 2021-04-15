/*
 * Copyright 2014-2016 Solace Systems, Inc. All rights reserved.
 *
 * http://www.solacesystems.com
 *
 * This source is distributed under the terms and conditions
 * of any contract or contracts between Solace Systems, Inc.
 * ("Solace") and you or your company. If there are no 
 * contracts in place use of this source is not authorized.
 * No support is provided and no distribution, sharing with
 * others or re-use of this source is authorized unless 
 * specifically stated in the contracts referred to above.
 *
 * This product is provided as is and is not supported by Solace 
 * unless such support is provided for under an agreement 
 * signed between you and Solace.
 */

package com.solace.psg.enterprisestats.statspump.pollers;

public class PollerRunnableStat {
    
    public enum Stat {
        
        SUCCESS_COUNT("Success Count"),
        TIMEOUT_COUNT("Timeout Count"),
        ERROR_COUNT("Error Count"),
        ;
        
        final String name;
        
        Stat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
