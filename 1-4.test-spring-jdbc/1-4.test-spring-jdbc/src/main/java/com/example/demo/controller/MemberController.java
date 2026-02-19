package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index() {
		/**全件検索 */
		repository.findAll().forEach(System.out::println);

		/**改行 */
		System.out.println();
		
		/**主キー検索 */
		System.out.println(repository.load(2));

		/**登録 */
		Member addmember = new Member();
		addmember.setName("高岡");
		addmember.setAge(24);
		addmember.setDepId(1);
		repository.save(addmember);

		/**2番のメンバーの名前のみ更新 */
		Member updateMember = repository.load(2);
		updateMember.setName("シロー");
		repository.save(updateMember);
		
		return "member";
	}
}
