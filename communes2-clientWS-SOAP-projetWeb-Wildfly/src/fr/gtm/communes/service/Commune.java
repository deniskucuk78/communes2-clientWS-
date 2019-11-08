/**
 * Commune.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.gtm.communes.service;

public class Commune  implements java.io.Serializable {
    private long id;

    private java.lang.String nom;

    private java.lang.String codePostal;

    private double gpsLatitude;

    private double gpsLongitude;

    private fr.gtm.communes.service.Departement departement;

    public Commune() {
    }

    public Commune(
           long id,
           java.lang.String nom,
           java.lang.String codePostal,
           double gpsLatitude,
           double gpsLongitude,
           fr.gtm.communes.service.Departement departement) {
           this.id = id;
           this.nom = nom;
           this.codePostal = codePostal;
           this.gpsLatitude = gpsLatitude;
           this.gpsLongitude = gpsLongitude;
           this.departement = departement;
    }


    /**
     * Gets the id value for this Commune.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Commune.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the nom value for this Commune.
     * 
     * @return nom
     */
    public java.lang.String getNom() {
        return nom;
    }


    /**
     * Sets the nom value for this Commune.
     * 
     * @param nom
     */
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }


    /**
     * Gets the codePostal value for this Commune.
     * 
     * @return codePostal
     */
    public java.lang.String getCodePostal() {
        return codePostal;
    }


    /**
     * Sets the codePostal value for this Commune.
     * 
     * @param codePostal
     */
    public void setCodePostal(java.lang.String codePostal) {
        this.codePostal = codePostal;
    }


    /**
     * Gets the gpsLatitude value for this Commune.
     * 
     * @return gpsLatitude
     */
    public double getGpsLatitude() {
        return gpsLatitude;
    }


    /**
     * Sets the gpsLatitude value for this Commune.
     * 
     * @param gpsLatitude
     */
    public void setGpsLatitude(double gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }


    /**
     * Gets the gpsLongitude value for this Commune.
     * 
     * @return gpsLongitude
     */
    public double getGpsLongitude() {
        return gpsLongitude;
    }


    /**
     * Sets the gpsLongitude value for this Commune.
     * 
     * @param gpsLongitude
     */
    public void setGpsLongitude(double gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }


    /**
     * Gets the departement value for this Commune.
     * 
     * @return departement
     */
    public fr.gtm.communes.service.Departement getDepartement() {
        return departement;
    }


    /**
     * Sets the departement value for this Commune.
     * 
     * @param departement
     */
    public void setDepartement(fr.gtm.communes.service.Departement departement) {
        this.departement = departement;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Commune)) return false;
        Commune other = (Commune) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.nom==null && other.getNom()==null) || 
             (this.nom!=null &&
              this.nom.equals(other.getNom()))) &&
            ((this.codePostal==null && other.getCodePostal()==null) || 
             (this.codePostal!=null &&
              this.codePostal.equals(other.getCodePostal()))) &&
            this.gpsLatitude == other.getGpsLatitude() &&
            this.gpsLongitude == other.getGpsLongitude() &&
            ((this.departement==null && other.getDepartement()==null) || 
             (this.departement!=null &&
              this.departement.equals(other.getDepartement())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Long(getId()).hashCode();
        if (getNom() != null) {
            _hashCode += getNom().hashCode();
        }
        if (getCodePostal() != null) {
            _hashCode += getCodePostal().hashCode();
        }
        _hashCode += new Double(getGpsLatitude()).hashCode();
        _hashCode += new Double(getGpsLongitude()).hashCode();
        if (getDepartement() != null) {
            _hashCode += getDepartement().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Commune.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.communes.gtm.fr/", "commune"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codePostal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codePostal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gpsLatitude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gpsLatitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gpsLongitude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gpsLongitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.communes.gtm.fr/", "departement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
