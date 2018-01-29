/*
 * generated by Xtext 2.12.0
 */
grammar InternalAlf;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.omg.sysml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.omg.sysml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.omg.sysml.services.AlfGrammarAccess;

}

@parser::members {

 	private AlfGrammarAccess grammarAccess;

    public InternalAlfParser(TokenStream input, AlfGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "PackageDefinition";
   	}

   	@Override
   	protected AlfGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulePackageDefinition
entryRulePackageDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPackageDefinitionRule()); }
	iv_rulePackageDefinition=rulePackageDefinition
	{ $current=$iv_rulePackageDefinition.current; }
	EOF;

// Rule PackageDefinition
rulePackageDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='package'
		{
			newLeafNode(otherlv_0, grammarAccess.getPackageDefinitionAccess().getPackageKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getNameNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.omg.sysml.Alf.Name");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPackageDefinitionAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPackageDefinitionAccess().getOwnedMemberPackagedElementParserRuleCall_3_0());
				}
				lv_ownedMember_3_0=rulePackagedElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackageDefinitionRule());
					}
					add(
						$current,
						"ownedMember",
						lv_ownedMember_3_0,
						"org.omg.sysml.Alf.PackagedElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getPackageDefinitionAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRulePackageDefinitionOrStub
entryRulePackageDefinitionOrStub returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPackageDefinitionOrStubRule()); }
	iv_rulePackageDefinitionOrStub=rulePackageDefinitionOrStub
	{ $current=$iv_rulePackageDefinitionOrStub.current; }
	EOF;

// Rule PackageDefinitionOrStub
rulePackageDefinitionOrStub returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getPackageDefinitionOrStubAccess().getPackageVisibilityVisibilityKindEnumRuleCall_0_0());
				}
				lv_packageVisibility_0_0=ruleVisibilityKind
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackageDefinitionOrStubRule());
					}
					set(
						$current,
						"packageVisibility",
						lv_packageVisibility_0_0,
						"org.omg.sysml.Alf.VisibilityKind");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='package'
		{
			newLeafNode(otherlv_1, grammarAccess.getPackageDefinitionOrStubAccess().getPackageKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPackageDefinitionOrStubAccess().getNameNameParserRuleCall_2_0());
				}
				lv_name_2_0=ruleName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackageDefinitionOrStubRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.omg.sysml.Alf.Name");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getPackageDefinitionOrStubAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPackageDefinitionOrStubAccess().getOwnedMemberPackagedElementParserRuleCall_4_0());
				}
				lv_ownedMember_4_0=rulePackagedElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPackageDefinitionOrStubRule());
					}
					add(
						$current,
						"ownedMember",
						lv_ownedMember_4_0,
						"org.omg.sysml.Alf.PackagedElement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getPackageDefinitionOrStubAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRulePackagedElement
entryRulePackagedElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPackagedElementRule()); }
	iv_rulePackagedElement=rulePackagedElement
	{ $current=$iv_rulePackagedElement.current; }
	EOF;

// Rule PackagedElement
rulePackagedElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getPackagedElementAccess().getPackagedElementDefinitionParserRuleCall());
	}
	this_PackagedElementDefinition_0=rulePackagedElementDefinition
	{
		$current = $this_PackagedElementDefinition_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRulePackagedElementDefinition
entryRulePackagedElementDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPackagedElementDefinitionRule()); }
	iv_rulePackagedElementDefinition=rulePackagedElementDefinition
	{ $current=$iv_rulePackagedElementDefinition.current; }
	EOF;

// Rule PackagedElementDefinition
rulePackagedElementDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPackagedElementDefinitionAccess().getPackageDefinitionOrStubParserRuleCall_0());
		}
		this_PackageDefinitionOrStub_0=rulePackageDefinitionOrStub
		{
			$current = $this_PackageDefinitionOrStub_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPackagedElementDefinitionAccess().getClassifierDefinitionOrStubParserRuleCall_1());
		}
		this_ClassifierDefinitionOrStub_1=ruleClassifierDefinitionOrStub
		{
			$current = $this_ClassifierDefinitionOrStub_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleClassifierDefinitionOrStub
entryRuleClassifierDefinitionOrStub returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassifierDefinitionOrStubRule()); }
	iv_ruleClassifierDefinitionOrStub=ruleClassifierDefinitionOrStub
	{ $current=$iv_ruleClassifierDefinitionOrStub.current; }
	EOF;

// Rule ClassifierDefinitionOrStub
ruleClassifierDefinitionOrStub returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getClassifierDefinitionOrStubAccess().getClassDefinitionOrStubParserRuleCall());
	}
	this_ClassDefinitionOrStub_0=ruleClassDefinitionOrStub
	{
		$current = $this_ClassDefinitionOrStub_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleClassDeclaration
entryRuleClassDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassDeclarationRule()); }
	iv_ruleClassDeclaration=ruleClassDeclaration
	{ $current=$iv_ruleClassDeclaration.current; }
	EOF;

// Rule ClassDeclaration
ruleClassDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_isAbstract_0_0='abstract'
				{
					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassDeclarationAccess().getIsAbstractAbstractKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassDeclarationRule());
					}
					setWithLastConsumed($current, "isAbstract", true, "abstract");
				}
			)
		)?
		otherlv_1='class'
		{
			newLeafNode(otherlv_1, grammarAccess.getClassDeclarationAccess().getClassKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClassDeclarationAccess().getNameNameParserRuleCall_2_0());
				}
				lv_name_2_0=ruleName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.omg.sysml.Alf.Name");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='specializes'
			{
				newLeafNode(otherlv_3, grammarAccess.getClassDeclarationAccess().getSpecializesKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClassDeclarationAccess().getGeneralizationGeneralizationParserRuleCall_3_1_0());
					}
					lv_generalization_4_0=ruleGeneralization
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
						}
						add(
							$current,
							"generalization",
							lv_generalization_4_0,
							"org.omg.sysml.Alf.Generalization");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)?
	)
;

// Entry rule entryRuleGeneralization
entryRuleGeneralization returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGeneralizationRule()); }
	iv_ruleGeneralization=ruleGeneralization
	{ $current=$iv_ruleGeneralization.current; }
	EOF;

// Rule Generalization
ruleGeneralization returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getGeneralizationRule());
				}
			}
			{
				newCompositeNode(grammarAccess.getGeneralizationAccess().getGeneralClassCrossReference_0());
			}
			ruleQualifiedName
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleClassDefinitionOrStub
entryRuleClassDefinitionOrStub returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassDefinitionOrStubRule()); }
	iv_ruleClassDefinitionOrStub=ruleClassDefinitionOrStub
	{ $current=$iv_ruleClassDefinitionOrStub.current; }
	EOF;

// Rule ClassDefinitionOrStub
ruleClassDefinitionOrStub returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getClassDefinitionOrStubAccess().getPackageVisibilityVisibilityKindEnumRuleCall_0_0());
				}
				lv_packageVisibility_0_0=ruleVisibilityKind
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassDefinitionOrStubRule());
					}
					set(
						$current,
						"packageVisibility",
						lv_packageVisibility_0_0,
						"org.omg.sysml.Alf.VisibilityKind");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_isAbstract_1_0='abstract'
				{
					newLeafNode(lv_isAbstract_1_0, grammarAccess.getClassDefinitionOrStubAccess().getIsAbstractAbstractKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassDefinitionOrStubRule());
					}
					setWithLastConsumed($current, "isAbstract", true, "abstract");
				}
			)
		)?
		otherlv_2='class'
		{
			newLeafNode(otherlv_2, grammarAccess.getClassDefinitionOrStubAccess().getClassKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClassDefinitionOrStubAccess().getNameNameParserRuleCall_3_0());
				}
				lv_name_3_0=ruleName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassDefinitionOrStubRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"org.omg.sysml.Alf.Name");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4='specializes'
			{
				newLeafNode(otherlv_4, grammarAccess.getClassDefinitionOrStubAccess().getSpecializesKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClassDefinitionOrStubAccess().getGeneralizationGeneralizationParserRuleCall_4_1_0());
					}
					lv_generalization_5_0=ruleGeneralization
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClassDefinitionOrStubRule());
						}
						add(
							$current,
							"generalization",
							lv_generalization_5_0,
							"org.omg.sysml.Alf.Generalization");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)?
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getClassDefinitionOrStubAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClassDefinitionOrStubAccess().getOwnedFeatureClassMemberParserRuleCall_6_0());
				}
				lv_ownedFeature_7_0=ruleClassMember
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassDefinitionOrStubRule());
					}
					add(
						$current,
						"ownedFeature",
						lv_ownedFeature_7_0,
						"org.omg.sysml.Alf.ClassMember");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getClassDefinitionOrStubAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleClassMember
entryRuleClassMember returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassMemberRule()); }
	iv_ruleClassMember=ruleClassMember
	{ $current=$iv_ruleClassMember.current; }
	EOF;

// Rule ClassMember
ruleClassMember returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getClassMemberAccess().getFeatureDefinitionParserRuleCall());
	}
	this_FeatureDefinition_0=ruleFeatureDefinition
	{
		$current = $this_FeatureDefinition_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleFeatureDefinition
entryRuleFeatureDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureDefinitionRule()); }
	iv_ruleFeatureDefinition=ruleFeatureDefinition
	{ $current=$iv_ruleFeatureDefinition.current; }
	EOF;

// Rule FeatureDefinition
ruleFeatureDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getMethodVisibilityVisibilityKindEnumRuleCall_0_0());
				}
				lv_methodVisibility_0_0=ruleVisibilityKind
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
					}
					set(
						$current,
						"methodVisibility",
						lv_methodVisibility_0_0,
						"org.omg.sysml.Alf.VisibilityKind");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getNameNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureDefinitionRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.omg.sysml.Alf.Name");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getFeatureDefinitionAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureDefinitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getFeatureDefinitionAccess().getDefiningTypeClassCrossReference_3_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getFeatureDefinitionAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleName
entryRuleName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNameRule()); }
	iv_ruleName=ruleName
	{ $current=$iv_ruleName.current.getText(); }
	EOF;

// Rule Name
ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall_0());
		}
		    |
		this_UNRESTRICTED_NAME_1=RULE_UNRESTRICTED_NAME
		{
			$current.merge(this_UNRESTRICTED_NAME_1);
		}
		{
			newLeafNode(this_UNRESTRICTED_NAME_1, grammarAccess.getNameAccess().getUNRESTRICTED_NAMETerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0());
		}
		this_Name_0=ruleName
		{
			$current.merge(this_Name_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='::'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getColonColonKeyword_1_0());
			}
			{
				newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1());
			}
			this_Name_2=ruleName
			{
				$current.merge(this_Name_2);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
	)
;

// Rule VisibilityKind
ruleVisibilityKind returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='public'
			{
				$current = grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getVisibilityKindAccess().getPublicEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='private'
			{
				$current = grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getVisibilityKindAccess().getPrivateEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='protected'
			{
				$current = grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getVisibilityKindAccess().getProtectedEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_BOOLEAN_VALUE : ('true'|'false');

RULE_NATURAL_VALUE : (('0'|'1'..'9' ('_'? '0'..'9')*)|('0b'|'0B') '0'..'1' ('_'? '0'..'1')*|('0x'|'0X') ('0'..'9'|'a'..'f'|'A'..'F') ('_'? ('0'..'9'|'a'..'f'|'A'..'F'))*|'0' '_'? '0'..'7' ('_'? '0'..'7')*);

RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_UNRESTRICTED_NAME : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

RULE_DOCUMENTATION_COMMENT : '/**' ( options {greedy=false;} : . )*'*/';

RULE_STATEMENT_ANNOTATION : '//@' ( options {greedy=false;} : . )*'\n';

RULE_INLINE_STATEMENT : '/*@inline(' (RULE_ID|RULE_UNRESTRICTED_NAME) ')' ( options {greedy=false;} : . )*'*/';

RULE_ML_COMMENT : '/*' ~(('*'|'@')) ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' (~(('@'|'\n'|'\r')) ~(('\n'|'\r'))*)? ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;
