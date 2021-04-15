//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb"&gt;http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.04 at 09:27:13 AM GMT 
//


package com.solace.psg.sempv1.solacesempreply;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lag-member-type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="lag-member-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="interface-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fabric" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="slot" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="instance" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lag-member-type", propOrder = {

})
public class LagMemberType {

    @XmlElement(name = "interface-id")
    protected String interfaceId;
    @XmlElement(required = true)
    protected BigInteger fabric;
    @XmlElement(required = true)
    protected BigInteger slot;
    @XmlElement(required = true)
    protected BigInteger instance;

    /**
     * Gets the value of the interfaceId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getInterfaceId() {
        return interfaceId;
    }

    /**
     * Sets the value of the interfaceId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInterfaceId(String value) {
        this.interfaceId = value;
    }

    /**
     * Gets the value of the fabric property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getFabric() {
        return fabric;
    }

    /**
     * Sets the value of the fabric property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setFabric(BigInteger value) {
        this.fabric = value;
    }

    /**
     * Gets the value of the slot property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSlot() {
        return slot;
    }

    /**
     * Sets the value of the slot property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSlot(BigInteger value) {
        this.slot = value;
    }

    /**
     * Gets the value of the instance property.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getInstance() {
        return instance;
    }

    /**
     * Sets the value of the instance property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setInstance(BigInteger value) {
        this.instance = value;
    }

}
