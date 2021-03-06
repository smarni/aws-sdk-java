/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.sqs.model;

import java.io.Serializable;

/**
 * <p>
 * For each message in the batch, the response contains a
 * ChangeMessageVisibilityBatchResultEntry tag if the message succeeds or
 * a BatchResultErrorEntry tag if the message fails.
 * </p>
 */
public class ChangeMessageVisibilityBatchResult implements Serializable, Cloneable {

    /**
     * A list of <a>ChangeMessageVisibilityBatchResultEntry</a> items.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ChangeMessageVisibilityBatchResultEntry> successful;

    /**
     * A list of <a>BatchResultErrorEntry</a> items.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BatchResultErrorEntry> failed;

    /**
     * A list of <a>ChangeMessageVisibilityBatchResultEntry</a> items.
     *
     * @return A list of <a>ChangeMessageVisibilityBatchResultEntry</a> items.
     */
    public java.util.List<ChangeMessageVisibilityBatchResultEntry> getSuccessful() {
        if (successful == null) {
              successful = new com.amazonaws.internal.ListWithAutoConstructFlag<ChangeMessageVisibilityBatchResultEntry>();
              successful.setAutoConstruct(true);
        }
        return successful;
    }
    
    /**
     * A list of <a>ChangeMessageVisibilityBatchResultEntry</a> items.
     *
     * @param successful A list of <a>ChangeMessageVisibilityBatchResultEntry</a> items.
     */
    public void setSuccessful(java.util.Collection<ChangeMessageVisibilityBatchResultEntry> successful) {
        if (successful == null) {
            this.successful = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ChangeMessageVisibilityBatchResultEntry> successfulCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ChangeMessageVisibilityBatchResultEntry>(successful.size());
        successfulCopy.addAll(successful);
        this.successful = successfulCopy;
    }
    
    /**
     * A list of <a>ChangeMessageVisibilityBatchResultEntry</a> items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param successful A list of <a>ChangeMessageVisibilityBatchResultEntry</a> items.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangeMessageVisibilityBatchResult withSuccessful(ChangeMessageVisibilityBatchResultEntry... successful) {
        if (getSuccessful() == null) setSuccessful(new java.util.ArrayList<ChangeMessageVisibilityBatchResultEntry>(successful.length));
        for (ChangeMessageVisibilityBatchResultEntry value : successful) {
            getSuccessful().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>ChangeMessageVisibilityBatchResultEntry</a> items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param successful A list of <a>ChangeMessageVisibilityBatchResultEntry</a> items.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangeMessageVisibilityBatchResult withSuccessful(java.util.Collection<ChangeMessageVisibilityBatchResultEntry> successful) {
        if (successful == null) {
            this.successful = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ChangeMessageVisibilityBatchResultEntry> successfulCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ChangeMessageVisibilityBatchResultEntry>(successful.size());
            successfulCopy.addAll(successful);
            this.successful = successfulCopy;
        }

        return this;
    }

    /**
     * A list of <a>BatchResultErrorEntry</a> items.
     *
     * @return A list of <a>BatchResultErrorEntry</a> items.
     */
    public java.util.List<BatchResultErrorEntry> getFailed() {
        if (failed == null) {
              failed = new com.amazonaws.internal.ListWithAutoConstructFlag<BatchResultErrorEntry>();
              failed.setAutoConstruct(true);
        }
        return failed;
    }
    
    /**
     * A list of <a>BatchResultErrorEntry</a> items.
     *
     * @param failed A list of <a>BatchResultErrorEntry</a> items.
     */
    public void setFailed(java.util.Collection<BatchResultErrorEntry> failed) {
        if (failed == null) {
            this.failed = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<BatchResultErrorEntry> failedCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BatchResultErrorEntry>(failed.size());
        failedCopy.addAll(failed);
        this.failed = failedCopy;
    }
    
    /**
     * A list of <a>BatchResultErrorEntry</a> items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failed A list of <a>BatchResultErrorEntry</a> items.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangeMessageVisibilityBatchResult withFailed(BatchResultErrorEntry... failed) {
        if (getFailed() == null) setFailed(new java.util.ArrayList<BatchResultErrorEntry>(failed.length));
        for (BatchResultErrorEntry value : failed) {
            getFailed().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>BatchResultErrorEntry</a> items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param failed A list of <a>BatchResultErrorEntry</a> items.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangeMessageVisibilityBatchResult withFailed(java.util.Collection<BatchResultErrorEntry> failed) {
        if (failed == null) {
            this.failed = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<BatchResultErrorEntry> failedCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BatchResultErrorEntry>(failed.size());
            failedCopy.addAll(failed);
            this.failed = failedCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSuccessful() != null) sb.append("Successful: " + getSuccessful() + ",");
        if (getFailed() != null) sb.append("Failed: " + getFailed() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSuccessful() == null) ? 0 : getSuccessful().hashCode()); 
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ChangeMessageVisibilityBatchResult == false) return false;
        ChangeMessageVisibilityBatchResult other = (ChangeMessageVisibilityBatchResult)obj;
        
        if (other.getSuccessful() == null ^ this.getSuccessful() == null) return false;
        if (other.getSuccessful() != null && other.getSuccessful().equals(this.getSuccessful()) == false) return false; 
        if (other.getFailed() == null ^ this.getFailed() == null) return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false) return false; 
        return true;
    }
    
    @Override
    public ChangeMessageVisibilityBatchResult clone() {
        try {
            return (ChangeMessageVisibilityBatchResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    