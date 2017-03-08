package org.hl7.fhir.dstu3.model.codesystems;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Sat, Mar 4, 2017 06:58-0500 for FHIR v1.9.0


import org.hl7.fhir.dstu3.model.EnumFactory;

public class MedicationRequestIntentEnumFactory implements EnumFactory<MedicationRequestIntent> {

  public MedicationRequestIntent fromCode(String codeString) throws IllegalArgumentException {
    if (codeString == null || "".equals(codeString))
      return null;
    if ("proposal".equals(codeString))
      return MedicationRequestIntent.PROPOSAL;
    if ("plan".equals(codeString))
      return MedicationRequestIntent.PLAN;
    if ("order".equals(codeString))
      return MedicationRequestIntent.ORDER;
    if ("instance-order".equals(codeString))
      return MedicationRequestIntent.INSTANCEORDER;
    throw new IllegalArgumentException("Unknown MedicationRequestIntent code '"+codeString+"'");
  }

  public String toCode(MedicationRequestIntent code) {
    if (code == MedicationRequestIntent.PROPOSAL)
      return "proposal";
    if (code == MedicationRequestIntent.PLAN)
      return "plan";
    if (code == MedicationRequestIntent.ORDER)
      return "order";
    if (code == MedicationRequestIntent.INSTANCEORDER)
      return "instance-order";
    return "?";
  }

    public String toSystem(MedicationRequestIntent code) {
      return code.getSystem();
      }

}

