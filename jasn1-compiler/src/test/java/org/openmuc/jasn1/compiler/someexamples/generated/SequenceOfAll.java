/**
 * This class file was automatically generated by jASN1 (http://www.openmuc.org)
 */

package org.openmuc.jasn1.compiler.someexamples.generated;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.LinkedList;
import org.openmuc.jasn1.ber.*;
import org.openmuc.jasn1.ber.types.*;
import org.openmuc.jasn1.ber.types.string.*;

public class SequenceOfAll {

	public final static BerIdentifier identifier = new BerIdentifier(BerIdentifier.UNIVERSAL_CLASS, BerIdentifier.CONSTRUCTED, 16);
	protected BerIdentifier id;

	public byte[] code = null;
	public BerInteger integer = null;

	public BerBoolean myBoolean = null;

	public BerBitString bitString = null;

	public BerEnum enumerated = null;

	public BerGeneralizedTime generalizedTime = null;

	public BerNull myNull = null;

	public BerObjectIdentifier objectIdentifier = null;

	public BerOctetString octetString = null;

	public BerReal real = null;

	public BerBMPString bmpString = null;

	public BerGeneralString generalString = null;

	public BerGraphicString graphicString = null;

	public BerIA5String iA5String = null;

	public BerNumericString numericString = null;

	public BerPrintableString printableString = null;

	public BerTeletexString teletexString = null;

	public BerUniversalString universalString = null;

	public BerUTF8String utf8String = null;

	public BerVideotexString videotexString = null;

	public BerVisibleString visibleString = null;

	public BerAny any = null;

	public SequenceOfAll() {
		id = identifier;
	}

	public SequenceOfAll(byte[] code) {
		id = identifier;
		this.code = code;
	}

	public SequenceOfAll(BerInteger integer, BerBoolean myBoolean, BerBitString bitString, BerEnum enumerated, BerGeneralizedTime generalizedTime, BerNull myNull, BerObjectIdentifier objectIdentifier, BerOctetString octetString, BerReal real, BerBMPString bmpString, BerGeneralString generalString, BerGraphicString graphicString, BerIA5String iA5String, BerNumericString numericString, BerPrintableString printableString, BerTeletexString teletexString, BerUniversalString universalString, BerUTF8String utf8String, BerVideotexString videotexString, BerVisibleString visibleString, BerAny any) {
		id = identifier;
		this.integer = integer;
		this.myBoolean = myBoolean;
		this.bitString = bitString;
		this.enumerated = enumerated;
		this.generalizedTime = generalizedTime;
		this.myNull = myNull;
		this.objectIdentifier = objectIdentifier;
		this.octetString = octetString;
		this.real = real;
		this.bmpString = bmpString;
		this.generalString = generalString;
		this.graphicString = graphicString;
		this.iA5String = iA5String;
		this.numericString = numericString;
		this.printableString = printableString;
		this.teletexString = teletexString;
		this.universalString = universalString;
		this.utf8String = utf8String;
		this.videotexString = videotexString;
		this.visibleString = visibleString;
		this.any = any;
	}

	public int encode(BerByteArrayOutputStream berOStream, boolean explicit) throws IOException {

		int codeLength;

		if (code != null) {
			codeLength = code.length;
			for (int i = code.length - 1; i >= 0; i--) {
				berOStream.write(code[i]);
			}
		}
		else {
			codeLength = 0;
			int sublength;

			sublength = any.encode(berOStream, true);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(berOStream, sublength);
			codeLength += (new BerIdentifier(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 9)).encode(berOStream);
			
			codeLength += visibleString.encode(berOStream, true);
			
			codeLength += videotexString.encode(berOStream, true);
			
			codeLength += utf8String.encode(berOStream, true);
			
			codeLength += universalString.encode(berOStream, true);
			
			codeLength += teletexString.encode(berOStream, true);
			
			codeLength += printableString.encode(berOStream, true);
			
			codeLength += numericString.encode(berOStream, true);
			
			codeLength += iA5String.encode(berOStream, true);
			
			codeLength += graphicString.encode(berOStream, true);
			
			codeLength += generalString.encode(berOStream, true);
			
			codeLength += bmpString.encode(berOStream, true);
			
			codeLength += real.encode(berOStream, true);
			
			codeLength += octetString.encode(berOStream, true);
			
			codeLength += objectIdentifier.encode(berOStream, true);
			
			codeLength += myNull.encode(berOStream, true);
			
			codeLength += generalizedTime.encode(berOStream, true);
			
			codeLength += enumerated.encode(berOStream, true);
			
			codeLength += bitString.encode(berOStream, true);
			
			codeLength += myBoolean.encode(berOStream, true);
			
			codeLength += integer.encode(berOStream, true);
			
			codeLength += BerLength.encodeLength(berOStream, codeLength);
		}

		if (explicit) {
			codeLength += id.encode(berOStream);
		}

		return codeLength;

	}

	public int decode(InputStream iStream, boolean explicit) throws IOException {
		int codeLength = 0;
		int subCodeLength = 0;
		BerIdentifier berIdentifier = new BerIdentifier();
		boolean decodedIdentifier = false;

		if (explicit) {
			codeLength += id.decodeAndCheck(iStream);
		}

		BerLength length = new BerLength();
		codeLength += length.decode(iStream);

		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerInteger.identifier)) {
				integer = new BerInteger();
				subCodeLength += integer.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerBoolean.identifier)) {
				myBoolean = new BerBoolean();
				subCodeLength += myBoolean.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerBitString.identifier)) {
				bitString = new BerBitString();
				subCodeLength += bitString.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerEnum.identifier)) {
				enumerated = new BerEnum();
				subCodeLength += enumerated.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerGeneralizedTime.identifier)) {
				generalizedTime = new BerGeneralizedTime();
				subCodeLength += generalizedTime.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerNull.identifier)) {
				myNull = new BerNull();
				subCodeLength += myNull.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerObjectIdentifier.identifier)) {
				objectIdentifier = new BerObjectIdentifier();
				subCodeLength += objectIdentifier.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerOctetString.identifier)) {
				octetString = new BerOctetString();
				subCodeLength += octetString.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerReal.identifier)) {
				real = new BerReal();
				subCodeLength += real.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerBMPString.identifier)) {
				bmpString = new BerBMPString();
				subCodeLength += bmpString.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerGeneralString.identifier)) {
				generalString = new BerGeneralString();
				subCodeLength += generalString.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerGraphicString.identifier)) {
				graphicString = new BerGraphicString();
				subCodeLength += graphicString.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerIA5String.identifier)) {
				iA5String = new BerIA5String();
				subCodeLength += iA5String.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerNumericString.identifier)) {
				numericString = new BerNumericString();
				subCodeLength += numericString.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerPrintableString.identifier)) {
				printableString = new BerPrintableString();
				subCodeLength += printableString.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerTeletexString.identifier)) {
				teletexString = new BerTeletexString();
				subCodeLength += teletexString.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerUniversalString.identifier)) {
				universalString = new BerUniversalString();
				subCodeLength += universalString.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerUTF8String.identifier)) {
				utf8String = new BerUTF8String();
				subCodeLength += utf8String.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerVideotexString.identifier)) {
				videotexString = new BerVideotexString();
				subCodeLength += videotexString.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerVisibleString.identifier)) {
				visibleString = new BerVisibleString();
				subCodeLength += visibleString.decode(iStream, false);
				decodedIdentifier = false;
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength < length.val) {
			if (decodedIdentifier == false) {
				subCodeLength += berIdentifier.decode(iStream);
				decodedIdentifier = true;
			}
			if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 9)) {
				BerLength tempLength = new BerLength();
				codeLength += tempLength.decode(iStream);
			}
			else {
				throw new IOException("Identifier does not macht required sequence element identifer.");
			}
		}
		if (subCodeLength != length.val) {
			throw new IOException("Decoded sequence has wrong length tag");

		}
		codeLength += subCodeLength;

		return codeLength;
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		BerByteArrayOutputStream berOStream = new BerByteArrayOutputStream(encodingSizeGuess);
		encode(berOStream, false);
		code = berOStream.getArray();
	}
}
