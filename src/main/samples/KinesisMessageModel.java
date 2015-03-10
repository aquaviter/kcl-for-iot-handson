/*
 * Copyright 2013-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package samples;

import java.io.Serializable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * This is the data model for the objects being sent through the Amazon Kinesis streams in the samples
 * 
 */
public class KinesisMessageModel implements Serializable {

    public String devicename;
    public String timestamp;
    public String value;

    /**
     * Default constructor for Jackson JSON mapper - uses bean pattern.
     */
    public KinesisMessageModel() {

    }

    /**
     * 
     * @param userid
     *        Sample int data field
     * @param devicename
     *        Sample String data field
     * @param timestamp
     *        Sample String data field
     * @param value
     *        Sample String data field
     * @param city
     *        Sample String data field
     * @param state
     *        Sample String data field (2 characters)
     * @param email
     *        Sample String data field
     * @param phone
     *        Sample String data field
     * @param likesports
     *        Sample boolean data field
     * @param liketheatre
     *        Sample boolean data field
     * @param likeconcerts
     *        Sample boolean data field
     * @param likejazz
     *        Sample boolean data field
     * @param likeclassical
     *        Sample boolean data field
     * @param likeopera
     *        Sample boolean data field
     * @param likerock
     *        Sample boolean data field
     * @param likevegas
     *        Sample boolean data field
     * @param likebroadway
     *        Sample boolean data field
     * @param likemusicals
     *        Sample boolean data field
     */
    public KinesisMessageModel(
            String devicename,
            String timestamp,
            String value
            ) {
        this.devicename = devicename;
        this.timestamp = timestamp;
        this.value = value;
    }

    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return super.toString();
        }
    }

    /**
     * Getter for devicename
     * 
     * @return devicename
     */

    public String getDevicename() {
        return devicename;
    }

    /**
     * Setter for devicename
     * 
     * @param devicename
     *        Value for devicename
     */
    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    /**
     * Getter for timestamp
     * 
     * @return timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Setter for timestamp
     * 
     * @param timestamp
     *        Value for timestamp
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Getter for value
     * 
     * @return value
     */
    public String getValue() {
        return value;
    }

    /**
     * Setter for value
     * 
     * @param value
     *        Value for value
     */
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((devicename == null) ? 0 : devicename.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof KinesisMessageModel)) {
            return false;
        }
        KinesisMessageModel other = (KinesisMessageModel) obj;
        if (timestamp == null) {
            if (other.timestamp != null) {
                return false;
            }
        } else if (!timestamp.equals(other.timestamp)) {
            return false;
        }
        if (value == null) {
            if (other.value != null) {
                return false;
            }
        } else if (!value.equals(other.value)) {
            return false;
        }
        if (devicename == null) {
            if (other.devicename != null) {
                return false;
            }
        } else if (!devicename.equals(other.devicename)) {
            return false;
        }
        return true;
    }
}
