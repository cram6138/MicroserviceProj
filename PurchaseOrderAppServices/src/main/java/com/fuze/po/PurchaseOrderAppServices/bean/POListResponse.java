//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.26 at 04:31:22 PM IST 
//


package com.fuze.po.PurchaseOrderAppServices.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="porespojo" type="{http://www.polistproduceritem.com/polist}porespojo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "porespojo"
})
@XmlRootElement(name = "POListResponse", namespace = "http://www.polistproduceritem.com/polist")
public class POListResponse {

    @XmlElement(namespace = "http://www.polistproduceritem.com/polist")
    protected List<Porespojo> porespojo;

    /**
     * Gets the value of the porespojo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the porespojo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPorespojo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Porespojo }
     * 
     * 
     */
    public List<Porespojo> getPorespojo() {
        if (porespojo == null) {
            porespojo = new ArrayList<Porespojo>();
        }
        return this.porespojo;
    }

}