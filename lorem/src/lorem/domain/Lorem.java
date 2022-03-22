package lorem.domain;

import lorem.annot.Aggregate;

@Aggregate(id="identityNo")
public  class Lorem {
	private IdentityNo identityNo;
	private Name name;
	
	public Lorem(Builder builder) {
		this.identityNo=builder.identityNo;
		this.name=builder.name;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public IdentityNo getIdentityNo() {
		return identityNo;
	}
	
	public static class Builder{
		private IdentityNo identityNo;
		private Name name;
		
		public Builder identityNo(int identityNo) {
			this.identityNo = IdentityNo.of(identityNo);
			return this;
		}
		public Builder name(String name) {
			this.name = Name.valueof(name);
			return this;
		}
		
		public Lorem build() {
			// validation
			// business rule
			// constraint
			// invariance
			return new Lorem(this);
		}
	}
	
	

}
