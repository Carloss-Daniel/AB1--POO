package ports;

/**
 * @param R response to fetch
 * @param url to fetch data
 */

public interface HttpClient<R> {
    public R fetch(String url);
  }
  
