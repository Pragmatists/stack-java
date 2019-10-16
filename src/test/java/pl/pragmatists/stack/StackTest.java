package pl.pragmatists.stack;

import org.junit.Test;

import static org.assertj.core.api.StrictAssertions.assertThat;


public class StackTest {

    public static final String ELEMENT = "element";
    public static final String ELEMENT_2 = "element2";
    private Stack stack = new Stack();

    @Test
    public void new_stack_should_be_empty() {
        assertThat(stack.size()).isEqualTo(0);
    }

    @Test
    public void stack_after_push_is_not_empty() {
        stack.push(ELEMENT);

        assertThat(stack.size()).isEqualTo(1);
    }

    @Test(expected = StackEmptyException.class)
    public void should_throw_exception_when_popping_empty_stack() {
        stack.pop();
    }

    @Test
    public void should_return_pushed_element() {
        stack.push(ELEMENT);

        assertThat(stack.pop()).isEqualTo(ELEMENT);
    }

    @Test
    public void size_after_pop_should_decrese() {
        stack.push(ELEMENT);
        stack.pop();

        assertThat(stack.size()).isEqualTo(0);
    }

    @Test
    public void elements_should_be_popped_in_reverse() {
        stack.push(ELEMENT);
        stack.push(ELEMENT_2);

    }
}


