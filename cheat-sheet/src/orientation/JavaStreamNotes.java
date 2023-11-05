package orientation;

import java.util.Optional;

public class JavaStreamNotes {
    public static void main(String[] args) {
        //STREAMS Intermediate operations
        /* -> An operation that is applied to a stream to transform or filter its elements.
        Intermediate operations are not executed until a terminal operation is invoked on the stream.

        filter(Predicate<T> predicate): This operation filters the stream by applying a
        given Predicate to each element. It creates a new stream containing only the elements
        that satisfy the predicate.

        map(Function<T, R> mapper): This operation transforms the stream by applying a
        given Function to each element. It creates a new stream of the transformed elements.

        flatMap(Function<T, Stream<R>> mapper): This operation is similar to map,
        but it flattens the result by combining multiple streams into a single stream.

        distinct(): This operation removes duplicate elements from the stream,
        creating a new stream with unique elements.

        sorted(): This operation sorts the elements of the stream in their natural order.
        You can also provide a custom comparator for sorting.

        peek(Consumer<T> action): This operation allows you to perform a side effect
        for each element in the stream while retaining the original elements.
        It is often used for debugging or logging.

        limit(long maxSize): This operation limits the stream to a specified number of elements,
        taking the first maxSize elements and discarding the rest.

        skip(long n): This operation skips the first n elements in the stream and
        returns a new stream with the remaining elements.
        */
    }

}
