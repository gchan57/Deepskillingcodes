import React from "react";

function BlogDetails() {

    const blogs = [

        {
            id: 1,
            title: "Learning React"
        },

        {
            id: 2,
            title: "Spring Boot REST API"
        },

        {
            id: 3,
            title: "JavaScript ES6"
        }

    ];

    return (

        <div>

            <h2>Blog Details</h2>

            <ul>

                {

                    blogs.map(blog => (

                        <li key={blog.id}>

                            {blog.title}

                        </li>

                    ))

                }

            </ul>

        </div>

    );

}

export default BlogDetails;