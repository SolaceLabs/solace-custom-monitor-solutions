//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb"&gt;http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 09:27:13 AM GMT 
//


package com.solace.psg.sempv1.solacesempreply;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for memory-info-type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="memory-info-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="memory-info"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="total-in-kb" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *                   &lt;element name="used-in-kb" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *                   &lt;element name="free-in-kb" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *                   &lt;element name="buffers-in-kb" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *                   &lt;element name="cached-in-kb" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "memory-info-type", propOrder = {
        "memoryInfo"
})
public class MemoryInfoType {

    @XmlElement(name = "memory-info", required = true)
    protected List<MemoryInfoType.MemoryInfo> memoryInfo;

    /**
     * Gets the value of the memoryInfo property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memoryInfo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemoryInfo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemoryInfoType.MemoryInfo }
     */
    public List<MemoryInfoType.MemoryInfo> getMemoryInfo() {
        if (memoryInfo == null) {
            memoryInfo = new ArrayList<MemoryInfoType.MemoryInfo>();
        }
        return this.memoryInfo;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="total-in-kb" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
     *         &lt;element name="used-in-kb" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
     *         &lt;element name="free-in-kb" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
     *         &lt;element name="buffers-in-kb" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
     *         &lt;element name="cached-in-kb" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class MemoryInfo {

        @XmlElement(required = true)
        protected String type;
        @XmlElement(name = "total-in-kb")
        @XmlSchemaType(name = "unsignedInt")
        protected long totalInKb;
        @XmlElement(name = "used-in-kb")
        @XmlSchemaType(name = "unsignedInt")
        protected long usedInKb;
        @XmlElement(name = "free-in-kb")
        @XmlSchemaType(name = "unsignedInt")
        protected long freeInKb;
        @XmlElement(name = "buffers-in-kb")
        @XmlSchemaType(name = "unsignedInt")
        protected Long buffersInKb;
        @XmlElement(name = "cached-in-kb")
        @XmlSchemaType(name = "unsignedInt")
        protected Long cachedInKb;

        /**
         * Gets the value of the type property.
         *
         * @return possible object is
         * {@link String }
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the totalInKb property.
         */
        public long getTotalInKb() {
            return totalInKb;
        }

        /**
         * Sets the value of the totalInKb property.
         */
        public void setTotalInKb(long value) {
            this.totalInKb = value;
        }

        /**
         * Gets the value of the usedInKb property.
         */
        public long getUsedInKb() {
            return usedInKb;
        }

        /**
         * Sets the value of the usedInKb property.
         */
        public void setUsedInKb(long value) {
            this.usedInKb = value;
        }

        /**
         * Gets the value of the freeInKb property.
         */
        public long getFreeInKb() {
            return freeInKb;
        }

        /**
         * Sets the value of the freeInKb property.
         */
        public void setFreeInKb(long value) {
            this.freeInKb = value;
        }

        /**
         * Gets the value of the buffersInKb property.
         *
         * @return possible object is
         * {@link Long }
         */
        public Long getBuffersInKb() {
            return buffersInKb;
        }

        /**
         * Sets the value of the buffersInKb property.
         *
         * @param value allowed object is
         *              {@link Long }
         */
        public void setBuffersInKb(Long value) {
            this.buffersInKb = value;
        }

        /**
         * Gets the value of the cachedInKb property.
         *
         * @return possible object is
         * {@link Long }
         */
        public Long getCachedInKb() {
            return cachedInKb;
        }

        /**
         * Sets the value of the cachedInKb property.
         *
         * @param value allowed object is
         *              {@link Long }
         */
        public void setCachedInKb(Long value) {
            this.cachedInKb = value;
        }

    }

}
