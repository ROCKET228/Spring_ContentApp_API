CREATE TABLE IF NOT EXISTS Content(
                                      id SERIAL PRIMARY KEY,
                                      title varchar(255) NOT NULL,
                                      "desc" text,
                                      status VARCHAR(20) NOT NULL,
                                      content_type VARCHAR(50) NOT NULL,
                                      date_created TIMESTAMP NOT NULL,
                                      date_updated TIMESTAMP,
                                      url varchar(255)
);

-- INSERT INTO Content( title, "desc", status, content_type, date_created, date_updated, url)
-- VALUES ( 'MY FIRST POST!!!',
--         'my first blog post',
--         'IDEA',
--          'ARTICLE',
--          '2023-05-23T18:11:06.2729048',
--         '2023-05-23T18:11:06.2729048',
--          '')

