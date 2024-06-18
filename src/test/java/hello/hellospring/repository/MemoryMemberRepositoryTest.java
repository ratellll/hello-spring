package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;


class MemoryMemberRepositoryTest{

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void test() {
        Member member = new Member();
        member.setName("bin");
        repository.save(member);

        Member byId = repository.findById(member.getId()).get();
        assertThat(member).isEqualTo(byId);

    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("bin");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("sol");
        repository.save(member2);


        Member result = repository.findByName("bin").get();

        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("bin");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("sol");
        repository.save(member2);

        List<Member> result = repository.findAll();
        assertThat(result.size()).isEqualTo(2);
    }
}
