package interfaces;

import abstructs.Member;

public interface MemberManagement {
	public void AddMember(Member member);

	public void showAllMember();

	public void removeMember(int id);

	public Member searchMember(int id);
}
